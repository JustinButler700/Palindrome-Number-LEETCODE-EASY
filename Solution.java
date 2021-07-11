class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x < 0){return false;} // if negative number it is not a palindrone
        ArrayList al = new ArrayList(); //dynamically add every integer to the arraylist
        while(x != 0)
        {
            al.add(x%10);
            x /= 10;
        }
        for(byte i = 0; al.size()>i;i++) // check if the arraylist is the same forwards and backwards.
        {
            if(!(al.get(i)==al.get(al.size()-1-i)))
            {
                return false;
            }
        }
        return true;
        
    }
