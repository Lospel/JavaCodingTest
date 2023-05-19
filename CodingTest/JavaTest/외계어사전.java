class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Character[] spellChar = new Character[spell.length];
        
        for(int i=0; i<spell.length; i++){
            spellChar[i] = spell[i].charAt(0);
        }
        
        int a = 0;
        for(int i =0; i<dic.length; i++){
            for(int p = 0; p<spellChar.length; p++){
                for(int j=0; j<dic[i].length(); j++){
                    Character dicCh = dic[i].charAt(j);
                    if(dicCh == spellChar[p]) {
                        a++;
                        break; 
                    }
                }
            }
            if (a == spell.length){
                return 1;
            }else{
                a = 0;
            }
        }
            
        answer = 2;
        return answer;
    }
}