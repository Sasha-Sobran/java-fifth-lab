package ua.lviv.iot.algo.part1.lab5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeFinder {
    private static final Pattern POSTAL_CODE_PATTERN = Pattern.compile("^([0-8]\\d{4})");

    private final String text;
    private final List<Integer> range;
    private final List<Integer> result;

    public PostalCodeFinder(final String text, final List<Integer> range) {
        this.text = text;
        this.range = new ArrayList<>(range);
        this.result = new LinkedList<>();
    }

    private boolean isUkrainianPostalCode(final String postalCode) {
        int code = Integer.parseInt(postalCode);
        return code >= range.get(0) && code <= range.get(1);
    }

    public List<Integer> findPostalCodes() {
        Matcher matcher = POSTAL_CODE_PATTERN.matcher(text);
        while (matcher.find()) {
            String postalCode = matcher.group();
            if (isUkrainianPostalCode(postalCode)) {
                result.add(Integer.valueOf(postalCode));
            }
        }
        return Collections.unmodifiableList(result);
    }
}
