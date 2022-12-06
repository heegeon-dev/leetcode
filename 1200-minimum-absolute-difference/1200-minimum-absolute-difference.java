class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        List<List<Integer>> minPairs = new ArrayList<>();
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int sub = arr[i+1]-arr[i];
            if(sub < minValue){
                minValue = sub;
                map.put(sub, new ArrayList<>(Arrays.asList(Arrays.asList(arr[i],arr[i+1]))));
            }else if(sub == minValue){
                List<List<Integer>> temp = map.get(minValue);
                temp.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }
        return map.get(minValue);
    }
}