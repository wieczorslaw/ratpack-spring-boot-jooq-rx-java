/*
 * This file is generated by jOOQ.
*/
package pl.homecenter.japlace.generated.db.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import pl.homecenter.japlace.generated.db.Japlace;
import pl.homecenter.japlace.generated.db.Keys;
import pl.homecenter.japlace.generated.db.tables.records.JpHistoriesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JpHistories extends TableImpl<JpHistoriesRecord> {

    private static final long serialVersionUID = -1028354192;

    /**
     * The reference instance of <code>JAPLACE.JP_HISTORIES</code>
     */
    public static final JpHistories JP_HISTORIES = new JpHistories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JpHistoriesRecord> getRecordType() {
        return JpHistoriesRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpHistoriesRecord, Object> HST_ID = createField("HST_ID", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpHistoriesRecord, Object> HST_USR_ID = createField("HST_USR_ID", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpHistoriesRecord, Object> HST_KEY = createField("HST_KEY", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpHistoriesRecord, Object> HST_AMOUNT = createField("HST_AMOUNT", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>JAPLACE.JP_HISTORIES.HST_DATE</code>.
     */
    public final TableField<JpHistoriesRecord, Date> HST_DATE = createField("HST_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpHistoriesRecord, Object> HST_DTST_ID = createField("HST_DTST_ID", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>JAPLACE.JP_HISTORIES</code> table reference
     */
    public JpHistories() {
        this(DSL.name("JP_HISTORIES"), null);
    }

    /**
     * Create an aliased <code>JAPLACE.JP_HISTORIES</code> table reference
     */
    public JpHistories(String alias) {
        this(DSL.name(alias), JP_HISTORIES);
    }

    /**
     * Create an aliased <code>JAPLACE.JP_HISTORIES</code> table reference
     */
    public JpHistories(Name alias) {
        this(alias, JP_HISTORIES);
    }

    private JpHistories(Name alias, Table<JpHistoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private JpHistories(Name alias, Table<JpHistoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Japlace.JAPLACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JpHistoriesRecord> getPrimaryKey() {
        return Keys.PK_JP_HISTORIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JpHistoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<JpHistoriesRecord>>asList(Keys.PK_JP_HISTORIES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpHistories as(String alias) {
        return new JpHistories(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpHistories as(Name alias) {
        return new JpHistories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JpHistories rename(String name) {
        return new JpHistories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JpHistories rename(Name name) {
        return new JpHistories(name, null);
    }
}