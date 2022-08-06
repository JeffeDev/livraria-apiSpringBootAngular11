package br.com.jeffe.livraria.exception;

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

		public StandardError() {
		}

		public Long getTimestamp() {
			return timestamp;
		}

		public Integer getStatus() {
			return status;
		}

		public String getMessage() {
			return message;
		}
		
}
