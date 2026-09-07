/*
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps. 
*/
class BrowserHistory {
    private String homepage;
    private Stack<String> urlsForBack;
    private Stack<String> urlsForForward;

    /* Initializes the object with the homepage of the browser. */
    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        urlsForBack = new Stack<>();
        urlsForForward = new Stack<>();

        urlsForBack.push(homepage);
    }
    
    /* Visits url from the current page. It clears up all the forward history. */
    public void visit(String url) {
        if (url == null || url.isBlank()) {
            return;
        }
        urlsForForward.clear();
        urlsForBack.push(url);
    }
    
    /* Move steps back in history. If you can only return x steps in the history and 
    steps > x, you will return only x steps. Return the current url after moving back 
    in history at most steps. */
    public String back(int steps) {
        if (steps > urlsForBack.size()) {
            steps = urlsForBack.size();
        }
        while(urlsForBack.size() > 1 && steps > 0) {
        urlsForForward.push(urlsForBack.pop());
        steps--;
        }
        return urlsForBack.peek();
    }
    
    /* Move steps forward in history. If you can only forward x steps in the hustory and 
    steps > x, you will forward only x steps, Return the current url after forwarding in 
    history at most steps. */
    public String forward(int steps) {
        if (steps > urlsForForward.size()) {
            steps = urlsForForward.size();
        }

        while (!urlsForForward.isEmpty() && steps > 0) {
            urlsForBack.push(urlsForForward.pop());
            steps--;
        }
        return urlsForBack.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */