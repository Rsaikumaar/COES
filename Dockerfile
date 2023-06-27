# Use the official Python image as the base image
FROM python:3.11.1

# Set the working directory in the container
WORKDIR /COES

# Copy the application files into the working directory
COPY . /COES

# Install the application dependencies
RUN pip install -r requirements.txt

# Define the entry point for the container
CMD ["flask", "run", "--host=8.8.8.8"]
