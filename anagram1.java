class Solution {
    
        public boolean isAnagram(String s, String t) {

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

}
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s: ");
        String s = sc.nextLine();
        System.out.println("Enter string t: ");
        String t = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isAnagram(s, t);

        if(result)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
}
}