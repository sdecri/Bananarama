/*
* Copyright 2016 BananaRama.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package sql.basic;

import javax.sql.DataSource;
import org.h2.jdbcx.JdbcDataSource;

/**
 *
 * @author Guglielmo De Concini
 */
public class DataSourceProvider {
    public static DataSource prepareDs(){
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:testdb");
        return ds;
    }
}
