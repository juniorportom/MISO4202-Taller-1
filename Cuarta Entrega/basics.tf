



	

# connection to AWS
provider "aws" {
  profile    = "default"
  region     = "us-east-1"
}
#end connection to AWS

		
# create the VPC
resource "aws_vpc" "vpcdesarrollo" {
  cidr_block           = ["172.34.0.0/16"]
  instance_tenancy     = "default" 
  enable_dns_support   = true 
  enable_dns_hostnames = true
  
} 
# end VPC

		
# create the security resource
resource "aws_Subred_1" "subred1" {
  vpc_id = vpcdesarrollo
  cidr_block              = ["172.34.2.0/24"]
  map_public_ip_on_launch = true 
  availability_zone       = z1		
}
# end security resouce
		
		
# create the security resource
resource "aws_Subred_2" "subred2" {
  vpc_id = vpcdesarrollo
  cidr_block              = ["172.34.1.0/24"]
  map_public_ip_on_launch = true 
  availability_zone       = z1		
}
# end security resouce
		
		
# create the security resource
resource "aws_InternetGateway" "gatewaydesarrollo" {
  vpc_id = vpcdesarrollo
  name         = InternetGateway
  description  = Seguridad_desarrollo
  map_public_ip_on_launch = true 
  availability_zone       = z1	
  
  		
 egress {
    from_port   = 80
    to_port     = 80
    protocol    = TCP
  }  		
  		
  		
 egress {
    from_port   = 8080
    to_port     = 8080
    protocol    = TCP
  }  		
  		
  		
 egress {
    from_port   = 22
    to_port     = 22
    protocol    = TCP
  }  		
  		
  	
}
# end security resouce
		

	
	#Public key
	resource "aws_key_pair" "ec2key" {
  	key_name = "ec2key1"
  	public_key = file("[/home/ubuntu/Documentos/Terraform/terraformtest_key.pem]")
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
	  resource "aws_instance" "servidorApp" {
	  ami           = data.aws_ami.ubuntu.id
	  instance_type = "t2.micro"
	  key_name = aws_key_pair.ec2key.key_name
	  vpc_security_group_ids = VPC
	  subnet_id = aws_subnet.subnet1.id

}
#End server instance
	


resource "aws_db_subnet_group" "dbsubnet1" {
  name       = "dbsubnet1"
  subnet_ids = [subred1,subred2]
}

	
	
	#DB instance
resource "aws_db_instance" "dbdesarrollo" {
  name = "db1"
  allocated_storage    = 20
  storage_type         = "gp2"
  engine               = "MySql"
  engine_version       = "5.7"
  instance_class       = "db.t2.micro"
  username             = "root"
  password             = "miso4202-202002"
  parameter_group_name = "default.mysql5.7"
  vpc_security_group_ids = [vpcdesarrollo]
  db_subnet_group_name = aws_db_subnet_group.dbsubnet1.name
}
#End db instance
	
	

#EBS instance
resource "aws_ebs_volume" "almacenamientodesarrollo" {
  availability_zone = z1
  size              = 20.0
}
#end EBS instance




#EBS attachment
resource "aws_volume_attachment" "ebs_att" {
  device_name = "/dev/sdh"
  volume_id   = almacenamientodesarrollo
  instance_id = servidorApp
}


	