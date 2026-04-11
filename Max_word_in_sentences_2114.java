class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWord=0;

        for(String sentence : sentences){

            int word=1;
            for(char c : sentence.toCharArray()){
                if(c ==' '){
                    word++;
                }

            }
            maxWord= Math.max(maxWord, word);
        }
        return maxWord;
    }
}