import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager postManager = new PostManager();
        System.out.println("== Social Media Post Manager ==");

        int engagementScore = postManager.calculateEngagement(150, 75, 25);
        String category = postManager.getCategoryRating(engagementScore);
        postManager.displayPostStats("Java Programming Tips", engagementScore, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        List<String> uniqueHashtags = postManager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        Map<String, Integer> samplePosts = new HashMap<>();
        samplePosts.put("Advanced Java Tutorial", 500);
        samplePosts.put("Spring Boot Guide", 150);

        List<String> trendingPosts = postManager.findTrendingPosts(samplePosts);
        List<String> sortedTrendingPosts = new ArrayList<>(trendingPosts);
        Collections.sort(sortedTrendingPosts);
        System.out.println("Trending Posts: " + sortedTrendingPosts);

        List<String> uniqueAuthors = postManager.getUniqueAuthors("Alice", "Bob", "Charlie", "Alice", "Bob");

        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
