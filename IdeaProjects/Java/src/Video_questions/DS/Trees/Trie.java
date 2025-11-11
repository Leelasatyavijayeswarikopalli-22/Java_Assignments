package Video_questions.DS.Trees;
class Node{
    Node[] links = new Node[26];
    boolean flag = false;
    boolean containsKey(char ch){
        return (links[ch-'a']!=null);
    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
}
public class Trie {
    Node root=new Node();
    void insert(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node= node.get(word.charAt(i));
        }
        node.setEnd();
    }
    public boolean search(String word){
        Node node=root;
        for (int i = 0; i <word.length() ; i++) {
            if(!node.containsKey(word.charAt(i))){
               return false;
            }
            node= node.get(word.charAt(i));
        }
        if(node.isEnd()){
            return true;
        }
        return false;
    }
    public boolean startWith(String prefix){
        Node node=root;
        for (int i = 0; i <prefix.length() ; i++) {
            if(node.containsKey(prefix.charAt(i))){
                node= node.get(prefix.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("apple");
        t.insert("apply");
        t.insert("apps");
        System.out.println(t.search("apps"));
        System.out.println(t.startWith("app"));
    }
}
