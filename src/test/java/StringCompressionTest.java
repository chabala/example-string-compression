import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class StringCompressionTest {

    private final StringCompression stringCompression = new StringCompression();

    @Test
    void stringCompressionOneChar() {
        assertThat(stringCompression.stringCompression("a"), is(equalTo("a")));
    }

    @Test
    void stringCompressionTwoChar() {
        assertThat(stringCompression.stringCompression("ab"), is(equalTo("ab")));
    }

    @Test
    void stringCompressionTwoCharMatch() {
        assertThat(stringCompression.stringCompression("aa"), is(equalTo("a2")));
    }

    @Test
    void stringCompression() {
        assertThat(stringCompression.stringCompression("aabbbc"), is(equalTo("a2b3c")));
    }
}
