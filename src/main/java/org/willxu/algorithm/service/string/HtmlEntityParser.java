package org.willxu.algorithm.service.string;

public interface HtmlEntityParser {
    /**
     * HTML entity parser is the parser that takes HTML code as input
     * and replace all the entities of the special characters by the
     * characters itself.
     * <p>
     * The special characters and their entities for HTML are:
     * <p>
     * - Quotation Mark: the entity is &quot; and symbol character is ".
     * - Single Quote Mark: the entity is &apos; and symbol character is '.
     * - Ampersand: the entity is &amp; and symbol character is &.
     * - Greater Than Sign: the entity is &gt; and symbol character is >.
     * - Less Than Sign: the entity is &lt; and symbol character is <.
     * - Slash: the entity is &frasl; and symbol character is /.
     * <p>
     * Given the input text string to the HTML parser, you have to
     * implement the entity parser.
     * <p>
     * Return the text after replacing the entities by the special
     * characters.
     *
     * @param text 1 <= text.length <= 105
     *             The string may contain any possible characters out of
     *             all the 256 ASCII characters.
     */
    String entityParser(String text);
}
