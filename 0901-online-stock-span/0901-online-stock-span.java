class StockSpanner {
    
    class Pair {
        int val;
        int day;
        
        Pair(int val, int day) {
            this.val = val;
            this.day = day;
        }
    }

    Stack<Pair> stack;
    public StockSpanner() {
        stack = new Stack<Pair>();
    }
    
    public int next(int price) {
        int day = 1;
        while(!stack.isEmpty() && stack.peek().val <= price) {
            day += stack.peek().day;
            stack.pop();
        }
        stack.push(new Pair(price, day));
        return stack.peek().day;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */