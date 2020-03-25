package com.example.votingapp.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 16;

    static {
        // Add some sample items.
        List<String> candidateNames = Arrays.asList(
                "Candidate 1",
                "Candidate 2",
                "Candidate 3",
                "Candidate 4",
                "Candidate 5",
                "Candidate 6",
                "Candidate 7",
                "Candidate 8",
                "Candidate 9",
                "Candidate 10",
                "Candidate 11",
                "Candidate 12",
                "Candidate 13",
                "Candidate 14",
                "Candidate 15",
                "Candidate 16"
        );
        List<String> candidateDetails = Arrays.asList(
                "Details for 1",
                "Details for 2",
                "Details for 3",
                "Details for 4",
                "Details for 5",
                "Details for 6",
                "Details for 7",
                "Details for 8",
                "Details for 9",
                "Details for 10",
                "Details for 11",
                "Details for 12",
                "Details for 13",
                "Details for 14",
                "Details for 15",
                "Details for 16"
        );
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i, candidateNames.get(i-1), candidateDetails.get(i-1)));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position, String name, String details ) {
        return new DummyItem(String.valueOf(position), name, details);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
