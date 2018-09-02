create database equasdevdb;

select * from eq_lookup;

INSERT INTO public.eq_lookup
(lookup_id, code, description, value, value_1, value_2, value_3, value_4, value_5, value_6)
VALUES(nextval('lookup_seq'), 'GENDER', 'MALE', '', '', '', '', '', '', '');
INSERT INTO public.eq_lookup
(lookup_id, code, description, value, value_1, value_2, value_3, value_4, value_5, value_6)
VALUES(nextval('lookup_seq'), 'GENDER', 'FEMALE', '', '', '', '', '', '', '');

SELECT nextval('lookup_seq');