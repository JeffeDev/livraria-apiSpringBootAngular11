package br.com.jeffe.livraria.exception;

import lombok.Data;
import lombok.Getter;

@Data @Getter
public class StandardError {
		private Long timestamp;
		private Integer status;
		private String message;
		
		public StandardError(Long timestamp, Integer status, String message) {
			super();
			this.timestamp = timestamp;
			this.status = status;
			this.message = message;
		}

}
