class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] tmp = polynomial.split(" ");
        int xNum = 0;
        int num = 0;

        for(String x : tmp){
            if(x.equals("x")){
                xNum++;
            }else if(x.contains("x")){
                xNum += Integer.parseInt(x.substring(0, x.length()-1));
            }else if(!x.equals("+")){
                num += Integer.parseInt(x);
                System.out.println(num);
            }
        }

        if(xNum != 0 && num != 0){
            if(xNum == 1){
                answer = "x + " + num;
            }else{
                answer = xNum + "x + " + num;
            }
        }

        if(xNum != 0 && num ==0){
            if(xNum == 1){
                answer = "x";
            }else{
                answer = xNum + "x";
            }
        }

        if(xNum ==0 && num != 0){
            answer = Integer.toString(num);
        }
        

        return answer;
    }
}