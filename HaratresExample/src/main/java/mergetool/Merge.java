package mergetool;

public class Merge {

    public String merge(String firstContent, String secondContent) throws Exception {

        String mergedString = "";

        try {
            if (firstContent.length() == 0 || firstContent.length() > 2499 || secondContent.length() == 0 || secondContent.length() > 2499) {
                throw new Exception();
            }
            String[] firstContentArray = firstContent.split("");
            String[] secondContentArray = secondContent.split("");

            int longestContentLength = Math.max(firstContent.length(), secondContent.length());
            for (int i = 0; i < longestContentLength; i++) {
                if (i < firstContentArray.length) {
                    mergedString += firstContentArray[i];
                }
                if (i < secondContentArray.length) {
                    mergedString += secondContentArray[i];
                }
            }
            return mergedString;
        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

}


