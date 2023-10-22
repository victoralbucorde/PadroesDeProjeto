INSERT INTO tb_endereco (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi)
VALUES ('12345-678', '123 Main St', 'Apt 101', 'Downtown', 'City', 'CA', '1234567', '123', '123', '12345');
INSERT INTO tb_cliente (id, name, endereco_cep)
VALUES (1, 'John Smith', '12345-678');
INSERT INTO tb_cliente (id, name, endereco_cep)
VALUES (2, 'Joao', '12345-678');