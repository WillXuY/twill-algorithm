package org.willxu.algorithm.service.ints;

public interface DistantBarcodes {
    /**
     * In a warehouse, there is a row of barcodes, where the i^th
     * barcode is barcodes[i].
     * <p>
     * Rearrange the barcodes so that no two adjacent barcodes are
     * equal. You may return any answer, and it is guaranteed an answer
     * exists.
     *
     * @param barcodes 1 <= barcodes.length <= 10000
     *                 1 <= barcodes[i] <= 10000
     */
    int[] rearrangeBarcodes(int[] barcodes);
}
