package ass02;

import java.util.*;
import java.util.Scanner;

public class BinarySearchTree {
	public static void main(String args[]) {
		LeafNode leafa, leafb, leafc;
		RootNode root1, root2, root3, root4;
		leafa = new LeafNode(new ArrayList<Integer>() {
			{
				add(100);
				add(120);
				add(140);
				add(160);
			}
		});
		leafb = new LeafNode(new ArrayList<Integer>() {
			{
				add(200);
				add(220);
				add(240);
				add(260);
			}
		});
		leafc = new LeafNode(new ArrayList<Integer>() {
			{
				add(300);
				add(320);
				add(340);
				add(360);
			}
		});

		root4 = new RootNode(300, 399, new ArrayList<Node>() {
			{
				add (leafc);
			}
		});
		root3 = new RootNode(200, 399, new ArrayList<Node>() {
			{
				add(leafb);
				add(root4);
			}
		});

		root2 = new RootNode(100, 199, new ArrayList<Node>() {
			{
				add(leafa);
			}
		});
		root1 = new RootNode(1, 1000, new ArrayList<Node>() {
			{
				add(root2);
				add(root3);
			}

		});
		System.out.println("You can search some value in the B-tree: ");
		Scanner sc = new Scanner(System.in); 
		System.out.println("You can input a value:");
		int value1 = sc.nextInt(); 
		System.out.println("Search Value1 : " + value1 + " " +root1.search(value1));
		System.out.println("You can input other value:");
		int value2 = sc.nextInt(); 
		System.out.println("Search Value1 : " + value2 + " "+root1.search(value2));
		
	}

}
