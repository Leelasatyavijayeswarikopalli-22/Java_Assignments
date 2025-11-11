package Video_questions.DS;
import java.util.*;
public class HuffmanCoding {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost;                       //frequency
        Node right;
        Node left;

        Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;             //if equal :return 0 ;else if less than: returns -1; else :1;
        }
    }

        public HuffmanCoding(String feeder) throws Exception {
            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int i = 0; i < feeder.length(); i++) {
                char ch = feeder.charAt(i);
                if (fmap.containsKey(ch)) {
                    int ov = fmap.get(ch);
                    ov += 1;
                    fmap.put(ch, ov);
                } else {
                    fmap.put(ch, 1);
                }
            }
            Heap<Node> minHeap = new Heap<>();
            Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                Node node = new Node(entry.getKey(), entry.getValue());
                minHeap.insert(node);
            }
            while (minHeap.size() > 1) {
                Node first = minHeap.remove();
                Node second = minHeap.remove();
                Node newNode = new Node('\0', first.cost + second.cost);
                newNode.left=first;
                newNode.right=second;
                minHeap.insert(newNode);
            }
            Node ft = minHeap.remove();                    //rootNode
            this.encoder = new HashMap<>();
            this.decoder = new HashMap<>();
            this.initEncoderDecoder(ft, "");
        }

        private void initEncoderDecoder(Node node, String osf) {                    //outPutSoFar
            if (node == null) {
                return;
            }
            if (node.left == null && node.right == null) {
                this.encoder.put(node.data, osf);
                this.decoder.put(osf, node.data);
            }
            initEncoderDecoder(node.left, osf + "0");
            initEncoderDecoder(node.right, osf + "1");
        }

        public String encode(String source) {
            StringBuilder sb = new StringBuilder();                   //BitSet can be used as an array but bits at each index
            for (int i = 0; i < source.length(); i++) {
                sb.append(encoder.get(source.charAt(i)));
            }
            return sb.toString();
        }

        public String Decode(String codedString) {
            String key = "";
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < codedString.length(); i++) {
                key = key + codedString.charAt(i);
                if (decoder.containsKey(key)) {
                    ans.append(decoder.get(key));
                    key = "";
                }
            }
            return ans.toString();
        }

        public static void main(String[] args) throws Exception {
            String str = "abbccda";
            HuffmanCoding hfc = new HuffmanCoding(str);
            String codedString = hfc.encode(str);
            System.out.println(codedString);
            String decodedString = hfc.Decode(codedString);
            System.out.println(decodedString);
        }

    }
