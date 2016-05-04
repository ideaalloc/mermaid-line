CREATE DATABASE /*!32312 IF NOT EXISTS*/`mermaidline` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
CREATE USER 'mermaidline'@'%' IDENTIFIED BY 'servicerequest';
GRANT ALL PRIVILEGES ON mermaidline.* TO 'mermaidline'@'%';
FLUSH PRIVILEGES;
