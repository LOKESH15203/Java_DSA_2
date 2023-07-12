package _18_Tries;

public class _1_Tries {

    static class Node {
        Node children[] = new Node[26];    // 26 alphabets
        boolean eow = false;               // End of Word = eow

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();         // This is always empty

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';             // Here if word.charAt(level) = 'a' we get a-a = 0(Zero) i.e.
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void main(String[] args) {

        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}

// Class