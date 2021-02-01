package model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//step01 - lombok ������� Customer�� car Ÿ���� ������ ���� �Ұ�
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//step02 - Car ������ ���� Customer ������ �󿡰� �����ϴ� �ֳ����̼�
// ������ �� ��� ��� : ������ ���� �Ǵ� ������Ƽ ����



@Component("T")
@Scope("prototype")
public class Team {
	private String name;
	private int year;
	@Autowired
	private Singer singer;	
}