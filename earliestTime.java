class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;
            for(int[] task:tasks){
                int complete=task[0]+task[1];
                earliest=Math.min(earliest,complete);
            }
            return earliest;
        }
}
