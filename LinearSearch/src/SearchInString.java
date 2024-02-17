public class SearchInString {
    public static void main(String[] args) {
        String name = "Adarsh Jha";
        char target = 'd';
        System.out.println(searchCharInString(name, target));
        System.out.println(searchCharInStr(name, target));
    }

    static boolean searchCharInString(String str, char key){
        if(str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == key) return true;
        }
        return false;
    }

    static boolean searchCharInStr(String str, char key){
        if(str.isEmpty()) return false;
        for (char ch : str.toCharArray()) {
            if(ch == key) return true;
        }
        return false;
    }

}
