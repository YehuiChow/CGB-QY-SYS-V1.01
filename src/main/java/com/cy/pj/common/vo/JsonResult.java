package com.cy.pj.common.vo;
	import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
	/**通过此对象封装服务端要返回给客户端的数据，
	 * 此对象最核心的作用是为业务层对象的执行结果
	 * 添加状态信息*/
	@Data
	@NoArgsConstructor
	public class JsonResult implements Serializable {
		private static final long serialVersionUID = -5766977494287555486L;
		/**状态码*/
		private int state=1;//1表示SUCCESS,0表示ERROR
		/**状态信息*/
		private String message="ok";
		/**正确数据*/
		private Object data;//date
		public JsonResult(String message){
			this.message=message;
		}
		public JsonResult(Object data){
			this.data=data;
		}
		public JsonResult(Throwable e){
			this.message=e.getMessage();
			this.state=0;
		}
	}

