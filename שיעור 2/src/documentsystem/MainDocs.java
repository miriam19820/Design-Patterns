package documentsystem;

import java.util.ArrayList;

public class MainDocs {

    public static void main(String[] args) {
        
        ArrayList<String> initialContent = new ArrayList<>();
        initialContent.add("Title: Project Alpha");
        initialContent.add("Chapter 1: Introduction");

        Document doc1 = new Document("Original Doc", "C:/Docs", 500, initialContent);
        
        System.out.println("--- Before Cloning ---");
        System.out.println(doc1);  

        Document doc2 = (Document) doc1.createClone();

        doc2.setName("Cloned Version");
        doc2.getContent().add("Chapter 2: Analysis");    

        System.out.println("\n--- After Modification ---");
        
        System.out.println("Original Document (Should NOT have Chapter 2):");
        System.out.println(doc1);  

        System.out.println("\nCloned Document (Should have Chapter 2):");
        System.out.println(doc2); 
    }
}