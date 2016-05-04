USE mermaidline;

CREATE TABLE admin (
  id             BIGINT(20)   NOT NULL AUTO_INCREMENT,
  username       VARCHAR(32)  NOT NULL,
  password       VARCHAR(128) NOT NULL,
  enabled        BIT(1)       NOT NULL DEFAULT 0,
  authority      VARCHAR(16)  NOT NULL DEFAULT 'ROLE_ADMIN',
  email          VARCHAR(64)  NOT NULL,
  phone          VARCHAR(32),
  sina_account   VARCHAR(64),
  weixin_account VARCHAR(64),
  qq_account     VARCHAR(64),
  avatar         VARCHAR(200),
  description    VARCHAR(500),
  PRIMARY KEY (id),
  UNIQUE INDEX admin_username_uqidx(username)
);
