public class jianzhi65_AddWith2th {

    static class Solution{

        public int add(int num1, int num2){

            while (num2 != 0){
                int sum = num1 ^ num2;

                int carry = (num1 & num2) << 1;
                num1 = sum;
                num2 = carry;
            }
            return num1;
        }


    }

}
