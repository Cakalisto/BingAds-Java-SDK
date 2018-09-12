package com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.BulkAdGroupSimilarRemarketingListAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupSimilarRemarketingListAssociation;

public class BulkAdGroupSimilarRemarketingListAssociationWriteAdGroupNameTest extends BulkAdGroupSimilarRemarketingListAssociationTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup 1", "Test AdGroup 1"},
            {"", ""},
            {null, null}
        });
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Ad Group", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupSimilarRemarketingListAssociation, String>() {
            @Override
            public void accept(BulkAdGroupSimilarRemarketingListAssociation c, String v) {
                c.setAdGroupName(v);;
            }
        });
    }
}
