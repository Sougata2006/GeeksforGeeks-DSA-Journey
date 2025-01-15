class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {

       Set<Integer> aSet = new HashSet();
       for(int i :a){
           aSet.add(i);
       }
       ArrayList<Integer> res = new ArrayList();
       for(int i:b){
           if(aSet.contains(i)){
               res.add(i);
               aSet.remove(i);
           }
       }
       return res;
            }
        }
