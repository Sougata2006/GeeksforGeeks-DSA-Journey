class Solution {
      static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
    static void correctBSTUtil(Node root, Node[] first, Node[] middle, 
                                Node[] last, Node[] prev) {
        if (root == null)
            return;

        correctBSTUtil(root.left, first, middle, last, prev);

        if (prev[0] != null && root.data < prev[0].data) {

            if (first[0] == null) {
                first[0] = prev[0];
                middle[0] = root;
            }

            else
                last[0] = root;
        }

        prev[0] = root;

        correctBSTUtil(root.right, first, middle, last, prev);
    }

    static void correctBST(Node root) {
        Node[] first = {null}, middle = {null}, 
               last = {null}, prev = {null};

        correctBSTUtil(root, first, middle, last, prev);

        if (first[0] != null && last[0] != null)
            swap(first[0], last[0]);
        else if (first[0] != null && middle[0] != null)
            swap(first[0], middle[0]);
    }

    static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int nonNull = 1;

        while (!queue.isEmpty() && nonNull > 0) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            nonNull--;

            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
            if (curr.left != null)
                nonNull++;
            if (curr.right != null)
                nonNull++;
        }
 }
