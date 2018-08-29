package io.jpress.module.page.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.page.model.base.BaseSinglePage;

/**
 * Generated by Jboot.
 */
@Table(tableName = "single_page", primaryKey = "id")
public class SinglePage extends BaseSinglePage<SinglePage> {

    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_DRAFT = 1;
    public static final int STATUS_TRASH = 9;

}