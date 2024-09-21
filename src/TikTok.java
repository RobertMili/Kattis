import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TikTok {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numberVideo = sc.nextInt();

        HashMap<String, Integer> video = new HashMap<>();

        for (int i = 0; i < numberVideo; i++) {
            String videoName = sc.next();
            int views = sc.nextInt();

            if (video.containsKey(videoName)) {
                // Handle the case where the video name already exists
                // For example, you can update the views
                video.put(videoName, video.get(videoName) + views);
            } else {
                video.put(videoName, views);
            }
        }

        String maxVide = null;
        int maxViews = 0;

        for (Map.Entry<String, Integer> entry :  video.entrySet())
        {
            if (entry.getValue() > maxViews)
            {
                maxViews = entry.getValue();
                maxVide = entry.getKey();
            }
        }

        if (maxVide != null) {
            System.out.println(maxVide);
        }



    }
}
