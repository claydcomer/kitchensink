# Use a base image with Node.js already installed
FROM node:latest

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json files
COPY package*.json ./

# Install dependencies
RUN npm install -g @angular/cli
RUN npm install

# Copy the entire frontend application
COPY . .

# Build the Angular application
CMD ["ng", "serve", "--host", "0.0.0.0"]
