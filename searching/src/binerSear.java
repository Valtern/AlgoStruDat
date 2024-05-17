public class binerSear {
    public int BinarySearch (int[] arr, int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == arr[mid]) {
                return (mid);
            } else if (arr[mid] > search){
                return BinarySearch(arr, search, left, mid - 1);
            } else {
                return BinarySearch(arr, search, mid + 1, right);
            }
        }
        return -1;
    }

    public int[] sort (int[] unsortedarr) {
        for (int i = 0; i < unsortedarr.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < unsortedarr.length; j++) {
                if (unsortedarr[j] < unsortedarr[idxMin]) {
                    idxMin = j;
                }
            }

            int tmp = unsortedarr[idxMin];
            unsortedarr[idxMin] = unsortedarr[i];
            unsortedarr[i] = tmp;
        }
        return unsortedarr;
    }
}


