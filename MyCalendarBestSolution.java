/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class MyCalendarBestSolution {

    private EventNode root;

    public MyCalendarBestSolution() {

    }

    public boolean book(int start, int end) {
        if (root == null) {
            root = new EventNode(start, end);
            return true;
        }

        return treeBool(root, start, end);
    }

    public boolean treeBool(EventNode node, int start, int end) {
        boolean left_bool = false, right_bool = false;
        if (end <= node.start) {
            if (node.left == null) {
                node.left = new EventNode(start, end);
                return true;
            }
            left_bool = treeBool(node.left, start, end);
        } else if (start >= node.end) {
            if (node.right == null) {
                node.right = new EventNode(start, end);
                return true;
            }
            right_bool = treeBool(node.right, start, end);
        }
        return left_bool || right_bool;
    }

    class EventNode {

        public int start;
        public int end;
        public EventNode left;
        public EventNode right;

        public EventNode(int s, int e) {
            start = s;
            end = e;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        MyCalendarBestSolution MyCalendar = new MyCalendarBestSolution();
        System.out.println(MyCalendar.book(10, 20));// returns true
        System.out.println(MyCalendar.book(15, 25)); // returns false
        System.out.println(MyCalendar.book(20, 30)); // returns true
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
