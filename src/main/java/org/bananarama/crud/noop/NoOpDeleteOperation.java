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
package org.bananarama.crud.noop;

import com.googlecode.cqengine.query.option.QueryOptions;
import java.io.IOException;
import java.util.stream.Stream;
import org.bananarama.crud.DeleteOperation;

/**
 * Delete operation that actually does nothing
 * @author Guglielmo De Concini
 */
public class NoOpDeleteOperation<T> implements DeleteOperation<T>{

    @Override
    public <Q> NoOpDeleteOperation<T> where(Q whereClaus) {
        return this;
    }

    @Override
    public <Q> NoOpDeleteOperation<T> where(Q whereClaus, QueryOptions options) {
        return this;
    }

    @Override
    public NoOpDeleteOperation<T> from(Stream<T> data) {
        return this;
    }

    @Override
    public NoOpDeleteOperation<T> from(Stream<T> data, QueryOptions options) {
        return this;
    }

    @Override
    public void close() throws IOException {
       /**
        * Nothing to close
        */
    }
    
    /**
    * {@inheritDoc}
    */
    @Override
    public DeleteOperation<T> all() {

        return this;
        
    }
    
}
