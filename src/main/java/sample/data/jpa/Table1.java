/*
 * Copyright 2018 the original author or authors.
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
package sample.data.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@IdClass(Table1.Table1PK.class)
public class Table1 implements Serializable {

	@Id
	String id;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	Table2 table2;

	public static class Table1PK implements Serializable {

		private String id;
		private Table2.Table2PK table2;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Table2.Table2PK getTable2() {
			return table2;
		}

		public void setTable2(Table2.Table2PK table2) {
			this.table2 = table2;
		}

	}
}
