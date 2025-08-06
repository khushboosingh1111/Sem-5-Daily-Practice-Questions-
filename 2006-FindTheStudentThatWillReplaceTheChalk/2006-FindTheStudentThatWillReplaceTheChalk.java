// Last updated: 8/6/2025, 10:10:38 AM
class Solution { 
    public int chalkReplacer(int[] chalk, int k) { 
        long total_chalk=0l; 
        for(int chalkNeeded:chalk){ 
            total_chalk+=chalkNeeded; 
        } 
        long chalk_remaning=k; 
        chalk_remaning%=total_chalk; 
        for(int i = 0; i<chalk.length; i++){
            long chalkNeed = chalk[i]; 
            if(chalk_remaning<chalkNeed){ 
                return i; 
            } 
            chalk_remaning-=chalkNeed; 
            } 
            return -1; 
            } 
            }