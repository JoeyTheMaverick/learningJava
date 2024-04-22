public class AlphaCount {
    public static void main(String[] args){
        String text = "India vs Australia finals was an amazing match";
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'A'){
                count++;
            }
        }
        System.out.print(count);
    }
}
