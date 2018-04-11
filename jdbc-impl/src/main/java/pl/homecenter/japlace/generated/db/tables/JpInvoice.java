/*
 * This file is generated by jOOQ.
*/
package pl.homecenter.japlace.generated.db.tables;


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
import pl.homecenter.japlace.generated.db.tables.records.JpInvoiceRecord;


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
public class JpInvoice extends TableImpl<JpInvoiceRecord> {

    private static final long serialVersionUID = -529314741;

    /**
     * The reference instance of <code>JAPLACE.JP_INVOICE</code>
     */
    public static final JpInvoice JP_INVOICE = new JpInvoice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JpInvoiceRecord> getRecordType() {
        return JpInvoiceRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpInvoiceRecord, Object> INV_ID = createField("INV_ID", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpInvoiceRecord, Object> INV_PESEL = createField("INV_PESEL", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpInvoiceRecord, Object> INV_AMOUNT = createField("INV_AMOUNT", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JpInvoiceRecord, Object> INV_NUMBER = createField("INV_NUMBER", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>JAPLACE.JP_INVOICE</code> table reference
     */
    public JpInvoice() {
        this(DSL.name("JP_INVOICE"), null);
    }

    /**
     * Create an aliased <code>JAPLACE.JP_INVOICE</code> table reference
     */
    public JpInvoice(String alias) {
        this(DSL.name(alias), JP_INVOICE);
    }

    /**
     * Create an aliased <code>JAPLACE.JP_INVOICE</code> table reference
     */
    public JpInvoice(Name alias) {
        this(alias, JP_INVOICE);
    }

    private JpInvoice(Name alias, Table<JpInvoiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private JpInvoice(Name alias, Table<JpInvoiceRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<JpInvoiceRecord> getPrimaryKey() {
        return Keys.PK_JP_INVOICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JpInvoiceRecord>> getKeys() {
        return Arrays.<UniqueKey<JpInvoiceRecord>>asList(Keys.PK_JP_INVOICE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpInvoice as(String alias) {
        return new JpInvoice(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpInvoice as(Name alias) {
        return new JpInvoice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JpInvoice rename(String name) {
        return new JpInvoice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JpInvoice rename(Name name) {
        return new JpInvoice(name, null);
    }
}
