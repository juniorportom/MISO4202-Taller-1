



	

# connection to AWS
provider "[aws]" {
  profile    = "default"
  region     = "us-east-1"
}
#end connection to AWS


		
# create the VPC
resource "aws_vpc" "[vpc1]" {
  cidr_block           = [10.0.0.0/16]
  instance_tenancy     = "default" 
  enable_dns_support   = true 
  enable_dns_hostnames = true
  
} 
# end VPC
		
		
# create the security resource
resource "aws_internet_gateway" "gateway1" {
  vpc_id = vpc1
}
# end security resouce
		
		
# create the security resource
resource "aws_subnet" "subnet1" {
  vpc_id = vpc1
  cidr_block              = 10.0.1.0/24
  map_public_ip_on_launch = true 
  availability_zone       = us-east-1a		
}
# end security resouce
		
		
# create the security resource
resource "aws_subnet" "subnet2" {
  vpc_id = vpc1
  cidr_block              = 10.0.2.0/24
  map_public_ip_on_launch = true 
  availability_zone       = us-east-1b		
}
# end security resouce
		
		
# create the security resource
resource "aws_security_group" "securitygroup1" {
  vpc_id = vpc1
  name         = security_group
  description  = Security Group 1
  map_public_ip_on_launch = true 
  availability_zone       = us-east-1a	
  
  		
 egress {
    from_port   = 22
    to_port     = 22
    protocol    = tcp
  }  		
  		
  		
 egress {
    from_port   = 0
    to_port     = 0
    protocol    = -1
  }  		
  		
  	
}
# end security resouce
		








	


#Public key
resource "aws_key_pair" "ec2key" {
  key_name = "ec2key1"
  public_key = [[org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3f8ee80f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@5b34e656 (name: AutenticacionFirma) (instanceClassName: null) (abstract: false, interface: false))]]
}
#end Public key






data "aws_ami" "ubuntu" {
  most_recent = true

  filter {
    name   = "name"
    values = ["ubuntu/images/hvm-ssd/ubuntu-trusty-14.04-amd64-server-*"]
  }

  filter {
    name   = "virtualization-type"
    values = ["hvm"]
  }

  owners = ["099720109477"] # Canonical
}

#Resources





#Server instance
resource "aws_instance" "ec21" {
  ami           = data.aws_ami.ubuntu.id
  instance_type = "t2.micro"
  key_name = aws_key_pair.ec2key.key_name
  vpc_security_group_ids = [aws_security_group.securitygroup1.id]
  subnet_id = aws_subnet.subnet1.id

}
#End server instane





resource "aws_db_subnet_group" "dbsubnet1" {
  name       = "dbsubnet1"
  subnet_ids = [aws_subnet.subnet1.id,aws_subnet.subnet2.id]
}




	


#DB instance
resource "aws_db_instance" "db1" {
  name = "db1"
  allocated_storage    = 20
  storage_type         = "gp2"
  engine               = "mysql"
  engine_version       = "5.7"
  instance_class       = "db.t2.micro"
  username             = "root"
  password             = "miso4202-202002"
  parameter_group_name = "default.mysql5.7"
  vpc_security_group_ids = [aws_security_group.securitygroup1.id]
  db_subnet_group_name = aws_db_subnet_group.dbsubnet1.name
}
#End db instance







#EBS instance
resource "aws_ebs_volume" "ebs1" {
  availability_zone = var.availabilityZone
  size              = 40
}
#end EBS instance







#EBS attachment
resource "aws_volume_attachment" "ebs_att" {
  device_name = "/dev/sdh"
  volume_id   = aws_ebs_volume.ebs1.id
  instance_id = aws_instance.ec21.id
}




	