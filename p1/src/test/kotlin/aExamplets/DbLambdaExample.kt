package aExamplets

import java.sql.Connection
import javax.sql.DataSource

fun DataSource.tx(l: (conn: Connection) -> Unit) {
    val conn = this.connection
    conn.autoCommit = false
    try {
        l(conn)
    } catch (e: Exception) {
        println(e)
    }
    conn.commit()
    conn.close()
}

fun txWithLambdas(ds: DataSource) {
    ds.tx {
        it.createStatement().executeUpdate("delete from user where id=43")
    }
}

fun txNoLambdas(ds: DataSource) {
    val conn = ds.connection
    conn.autoCommit = false
    try {
        conn.createStatement().executeUpdate("delete from user where id=43")
    } catch (e: Exception) {
        println(e)
    }
    conn.commit()
    conn.close()
}

