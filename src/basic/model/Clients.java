/*
 * package basic.model;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id;
 * 
 * @Entity(name = "table_clients") public class Clients {
 * 
 * @Id private String CPF; private String Name;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * public Clients() { // TODO Auto-generated constructor stub }
 * 
 * public Clients(String cPF, String name) { super(); this.CPF = cPF; this.Name
 * = name; }
 * 
 * @Override public String toString() { return "Clients [CPF=" + CPF + ", Name="
 * + Name + ", id=" + id + "]"; }
 * 
 * public String getCPF() { return CPF; }
 * 
 * public void setCPF(String cPF) { this.CPF = cPF; }
 * 
 * public String getName() { return Name; }
 * 
 * public void setName(String name) { this.Name = name; }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * 
 * 
 * }
 */
