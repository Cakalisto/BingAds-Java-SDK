package com.microsoft.bingads.v13.api.test.entities.bidstrategy.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;

public class BulkBidStrategyWriteToRowValuesParentIdTest extends BulkBidStrategyTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkBidStrategy, Long>() {
            @Override
            public void accept(BulkBidStrategy c, Long v) {
                c.setAccountId(v);
            }
        });
    }
}
