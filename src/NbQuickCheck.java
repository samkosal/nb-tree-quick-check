import java.util.List;
import java.util.Map;

public class NbQuickCheck {

  /**
   * Performs a pre-order traversal of the tree, printing each node on a separate line.
   * Does nothing if the root is not present in the tree.
   *
   * @param tree the tree represented as a map of parent nodes to child lists
   * @param root the root node to start traversal from
   */
  public static void preOrder(Map<Integer, List<Integer>> tree, int root) {
    if(!tree.containsKey(root)) {
      return;
    }

    System.out.println(root);

    List<Integer> children = tree.get(root);

    for (int child : children) {
      preOrder(tree, child);
    }

  }

  /**
   * Returns the minimum value in the tree.
   * Returns Integer.MAX_VALUE if the root is null.
   *
   * @param root the root node of the tree
   * @return the minimum value in the tree or Integer.MAX_VALUE if root is null
   */
  public static int minVal(Node<Integer> root) {
    
  }
  
  public static void main(String[] args) {
    // Create a sample tree
    Node<Integer> root = new Node<>(10);
    Node<Integer> child1 = new Node<>(5);
    Node<Integer> child2 = new Node<>(20);
    Node<Integer> child3 = new Node<>(3);
    Node<Integer> child4 = new Node<>(7);
    root.children.add(child1);
    root.children.add(child2);
    child1.children.add(child3);
    child1.children.add(child4);

    // Print the tree visually
    System.out.println("Tree structure:");
    printTree(root, 0);

    // Find and print the minimum value
    int min = minVal(root);
    System.out.println("Minimum value in the tree: " + min);
  }

  // Helper method to print the tree visually
  public static void printTree(Node<Integer> node, int level) {
    if (node == null) return;
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
    System.out.println(node.value);
    for (Node<Integer> child : node.children) {
      printTree(child, level + 1);
    }
  }
}
