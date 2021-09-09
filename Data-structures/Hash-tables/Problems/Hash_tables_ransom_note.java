// Problem Link: https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_r=internal-search

/**
* @author Ahmed Osama Tantawy
* 
*         Given: two notes note1, note2 with m, n lengths 
*
*         Objective: check if note2 contains only words which is exist in note1 with less than or equal frequency
*         
*         Note: words are case-sensitive
* 
*         Constrains: 1 <= m, n <= 30000
* 
*         Strategy: put note1 in map then for every word in note2 check if this word in map or not 
*
*         Overall Complexity: O(m)
* 
*/




public class Hash_tables_ransom_note {
    
    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String,Integer> wordsCount = new HashMap<>();
        int wordFrequency = 0;
        
        for(String word: magazine) {
            wordsCount.put(word, wordsCount.getOrDefault(word,0)+1);
        }
        
        for(String word:note) {
            wordFrequency = wordsCount.getOrDefault(word,-1);
            if (wordFrequency <= 0) {
                System.out.println("No");
                return;
            }
            wordsCount.put(word,wordFrequency-1);
        }
        
        System.out.println("Yes");

    }

}